import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
    pageTitle: string = "Product List Page";
    imageWidth:number = 80;
    imageMargin:number = 10;
 
    showImage:boolean = false;
 
    toggleImage() : void {
        this.showImage = !this.showImage;
        // (!false = true) // (!true == false)
  console.log('Value of ShowImage inside function ::',                              this.showImage);   
    }
 
 }
 

