import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CarreteService } from '../../services/carrete.service';
import { Carrete } from '../../models/carrete';

@Component({
  selector: 'app-carrete-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './carrete-list.component.html',
  styleUrls: ['./carrete-list.component.css']
})
export class CarreteListComponent implements OnInit {
  carretes: Carrete[] = [];

  constructor(private carreteService: CarreteService) { }

  ngOnInit(): void {
    this.carreteService.getCarretes().subscribe({
      next: (response) => {
        this.carretes = response.object;
        console.log('Carretes loaded:', this.carretes); // Debug log
      },
      error: (error) => {
        console.error('Error fetching carretes:', error);
      }
    });
  }
}