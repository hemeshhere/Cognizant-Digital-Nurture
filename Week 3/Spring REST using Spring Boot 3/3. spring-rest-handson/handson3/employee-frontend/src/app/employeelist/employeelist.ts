import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common'; // Required for *ngIf, *ngFor
import { FormsModule } from '@angular/forms';   // Required for [(ngModel)]
import { EmployeeService, Employee } from '';

@Component({
  selector: 'app-employee-list',
  standalone: true,
  imports: [CommonModule, FormsModule], // Import modules directly here
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[] = [];
  selectedEmployee: Employee | null = null; 

  constructor(private employeeService: EmployeeService) {}

  ngOnInit(): void {
    this.loadEmployees();
  }

  loadEmployees(): void {
    this.employeeService.getEmployeeList().subscribe({
      next: (data) => this.employees = data,
      error: (err) => console.error('Failed to fetch employees', err)
    });
  }

  onEdit(id: number): void {
    this.employeeService.getEmployeeById(id).subscribe({
      next: (data) => this.selectedEmployee = data,
      error: (err) => console.error('Failed to fetch employee details', err)
    });
  }

  cancelEdit(): void {
    this.selectedEmployee = null;
  }
}