import { TestBed } from '@angular/core/testing';

import { CarreteService } from './carrete.service';

describe('CarreteService', () => {
  let service: CarreteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CarreteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
