import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AssistedProj3';
  isactive: boolean = true;
  toggleImage() {
    // Implement the logic for toggling the image
    console.log('Image toggled!');
}
}
