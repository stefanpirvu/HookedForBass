import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CaniaListComponent } from './cania-list.component';

describe('CaniaListComponent', () => {
  let component: CaniaListComponent;
  let fixture: ComponentFixture<CaniaListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CaniaListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CaniaListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
