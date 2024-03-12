import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UserloginsComponent } from "./userlogins/userlogins.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, UserloginsComponent]
})
export class AppComponent {
  title = 'app-userlogins';
}
