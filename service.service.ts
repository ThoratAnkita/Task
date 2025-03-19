import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  baseUrl:string='http://localhost:8080/';
  constructor(private http:HttpClient) { }

  getAllEmp(){
    return (this.http.get(`${this.baseUrl}getAllEmp`))
  }

}
function getAllEmp() {
  throw new Error('Function not implemented.');
}

