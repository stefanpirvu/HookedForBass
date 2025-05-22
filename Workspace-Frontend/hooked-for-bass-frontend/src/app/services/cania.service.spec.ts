import { TestBed } from '@angular/core/testing';

import { CaniaService } from './cania.service';

describe('CaniaService', () => {
  let service: CaniaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CaniaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
