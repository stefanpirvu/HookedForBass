import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CaniaResponse } from '../models/cania-response';

@Injectable({
  providedIn: 'root'
})
export class CaniaService {
  private apiUrl = 'http://localhost:8080/cania/obtenerCanias';

  constructor(private http: HttpClient) { }

  getCanias(): Observable<CaniaResponse> {
    return this.http.get<CaniaResponse>(this.apiUrl);
  }
}