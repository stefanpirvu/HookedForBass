import { Component, OnInit } from '@angular/core';
import { CaniaService } from '../../services/cania.service';
import { Cania } from '../../models/cania';

@Component({
  selector: 'app-cania-list',
  standalone: true,
  imports: [],
  templateUrl: './cania-list.component.html',
  styleUrls: ['./cania-list.component.css']
})
export class CaniaListComponent implements OnInit {
  canias: Cania[] = [];
  currentImageIndices: { [caniaId: number]: number } = {};

  constructor(private caniaService: CaniaService) { }

  ngOnInit(): void {
    this.caniaService.getCanias().subscribe({
      next: (response) => {
        this.canias = response.object;
        this.canias.forEach(cania => {
          this.currentImageIndices[cania.id_cania] = 0;
        });
        console.log('Cañas loaded:', this.canias);
      },
      error: (error) => {
        console.error('Error fetching cañas:', error);
      }
    });
  }

  nextImage(caniaId: number): void {
    if (this.currentImageIndices[caniaId] < this.getCaniaImages(caniaId).length - 1) {
      this.currentImageIndices[caniaId]++;
    } else {
      this.currentImageIndices[caniaId] = 0;
    }
  }

  prevImage(caniaId: number): void {
    if (this.currentImageIndices[caniaId] > 0) {
      this.currentImageIndices[caniaId]--;
    } else {
      this.currentImageIndices[caniaId] = this.getCaniaImages(caniaId).length - 1;
    }
  }

  private getCaniaImages(caniaId: number): string[] {
    const cania = this.canias.find(c => c.id_cania === caniaId);
    return cania && cania.imagenes ? cania.imagenes : [];
  }
}