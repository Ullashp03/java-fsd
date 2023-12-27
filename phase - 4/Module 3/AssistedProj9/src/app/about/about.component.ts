import { Component } from '@angular/core';
import { ServiceworkService } from '../servicework.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
  constructor(private serviceobj:ServiceworkService) { }


  mobiles=this.serviceobj.mobile;
  ngOnInit(): void {
  }

}
