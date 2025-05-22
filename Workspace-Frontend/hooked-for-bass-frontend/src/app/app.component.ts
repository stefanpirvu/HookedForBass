import { Component } from '@angular/core';
import { CarreteListComponent } from './components/carrete-list/carrete-list.component';
import { CaniaListComponent } from './components/cania-list/cania-list.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CarreteListComponent, CaniaListComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hooked-for-bass-frontend';
}