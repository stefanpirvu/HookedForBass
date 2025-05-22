import { Component } from '@angular/core';
import { CarreteListComponent } from './components/carrete-list/carrete-list.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CarreteListComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hooked-for-bass-frontend';
}