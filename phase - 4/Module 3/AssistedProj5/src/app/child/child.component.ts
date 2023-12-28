import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
  @Input()
  pdata!: string;
  @Output() cevent = new EventEmitter<string>();

  onChange(value: string) {
    this.cevent.emit(value);
  }

}
