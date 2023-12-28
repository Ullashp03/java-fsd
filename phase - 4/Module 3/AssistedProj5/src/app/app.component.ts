import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
  public cdata!: string; // Assuming cdata should be a string

  handleChildEvent(eventData: string) {
    this.cdata = eventData;
  }
}
