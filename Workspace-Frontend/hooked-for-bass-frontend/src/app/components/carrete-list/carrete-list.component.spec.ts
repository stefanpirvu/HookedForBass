import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarreteListComponent } from './carrete-list.component';

describe('CarreteListComponent', () => {
  let component: CarreteListComponent;
  let fixture: ComponentFixture<CarreteListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CarreteListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CarreteListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
