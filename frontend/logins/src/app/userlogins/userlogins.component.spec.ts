import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserloginsComponent } from './userlogins.component';

describe('UserloginsComponent', () => {
  let component: UserloginsComponent;
  let fixture: ComponentFixture<UserloginsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UserloginsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UserloginsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
