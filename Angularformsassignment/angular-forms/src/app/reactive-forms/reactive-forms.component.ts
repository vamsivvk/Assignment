import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormArray, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-forms',
  templateUrl: './reactive-forms.component.html',
  styleUrls: ['./reactive-forms.component.css']
})
export class ReactiveFormsComponent implements OnInit {
registrationform :FormGroup;
  constructor() { }

  ngOnInit(): void {
    this.registrationform = new FormGroup({
    email:new FormControl(null,[Validators.required]),
    password:new FormControl(), 
    skills : new FormArray([
      new FormControl(),
    ])
    })
  }
  get email(){
    return this.registrationform.get('email');
  }
  get password(){
    return this.registrationform.get('password');
  }
  get skills(){
    return this.registrationform.get('skills') as FormArray;
  }
submitform(){
  console.log(this.registrationform);
  console.log(this.skills);
  console.log(this.registrationform.reset());
}
addSkills(){
  this.skills.push(new FormControl)
}
removeSkills(index:number){
  this.skills.removeAt(index);
}


}
