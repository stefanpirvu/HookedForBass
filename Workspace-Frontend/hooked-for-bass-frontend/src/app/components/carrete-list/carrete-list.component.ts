import { Component, OnInit } from '@angular/core';
import { CarreteService } from '../../services/carrete.service';
import { Carrete } from '../../models/carrete';

@Component({
  selector: 'app-carrete-list',
  standalone: true,
  imports: [],
  templateUrl: './carrete-list.component.html',
  styleUrls: ['./carrete-list.component.css']
})
export class CarreteListComponent implements OnInit {
  carretes: Carrete[] = [];
  currentImageIndices: { [carreteId: number]: number } = {};

  constructor(private carreteService: CarreteService) { }

  ngOnInit(): void {
    this.carreteService.getCarretes().subscribe({
      next: (response) => {
        this.carretes = response.object;
        this.carretes.forEach(carrete => {
          this.currentImageIndices[carrete.id] = 0;
        });
        console.log('Carretes loaded:', this.carretes);
      },
      error: (error) => {
        console.error('Error fetching carretes:', error);
      }
    });
  }

  nextImage(carreteId: number): void {
    if (this.currentImageIndices[carreteId] < this.getCarreteImages(carreteId).length - 1) {
      this.currentImageIndices[carreteId]++;
    } else {
      this.currentImageIndices[carreteId] = 0;
    }
  }

  prevImage(carreteId: number): void {
    if (this.currentImageIndices[carreteId] > 0) {
      this.currentImageIndices[carreteId]--;
    } else {
      this.currentImageIndices[carreteId] = this.getCarreteImages(carreteId).length - 1;
    }
  }

  private getCarreteImages(carreteId: number): string[] {
    const carrete = this.carretes.find(c => c.id === carreteId);
    return carrete && carrete.imagenes ? carrete.imagenes : [];
  }
}