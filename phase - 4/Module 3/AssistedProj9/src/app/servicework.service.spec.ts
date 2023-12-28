import { TestBed } from '@angular/core/testing';

import { ServiceworkService } from './servicework.service';

describe('ServiceworkService', () => {
  let service: ServiceworkService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceworkService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
