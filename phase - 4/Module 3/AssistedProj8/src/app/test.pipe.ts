import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'test'
})
export class TestPipe implements PipeTransform {

  transform(value: any, param1:any): string {
    if(value.gender=="m"){
     return "Hello Mr. "+value.name+"  "+param1
    }
    else{
     return "Hello Miss. "+value.name+"  "+param1
    }
   }
 
 
 }

