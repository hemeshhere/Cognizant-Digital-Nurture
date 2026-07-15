import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { EmployeeListComponent } from './employeelist/employeelist'; // 1. Import the component

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, EmployeeListComponent], 
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'employee-frontend';
}