import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CarreteResponse } from '../models/carrete-response';

@Injectable({
  providedIn: 'root'
})
export class CarreteService {
  private apiUrl = 'http://localhost:8080/carrete/obtenerCarretes';

  constructor(private http: HttpClient) { }

  getCarretes(): Observable<CarreteResponse> {
    return this.http.get<CarreteResponse>(this.apiUrl);
  }
}