import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent, ChangeColorDirective } from './app.component';

@NgModule({
  declarations: [
    AppComponent,
    ChangeColorDirective,
    ProductComponent,
    MyUpperPipe,
    DiscountPipe,
    ProductSearch,
    ProductDetailComponent
  ],
   
  imports: [
    BrowserModule,
    AppRoutingModule,
    SharedModule,
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
