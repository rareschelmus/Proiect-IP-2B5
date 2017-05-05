import {Routes, RouterModule} from "@angular/router";
import {ModuleWithProviders} from "@angular/core";
import {DashboardComponent} from "./dashboard/dashboard.component";
import {LoginComponent} from "./login/login.component";
import {RegisterComponent} from "./register/register.component";
import {CreateComponent} from "./dashboard/create/create.component";
import {ModifyComponent} from "./dashboard/modify/modify.component";
import {ProjectsComponent} from "./dashboard/projects/projects.component";
/**
 * Created by BlackDeathM8 on 05-May-17.
 */

export const router : Routes = [
  { path:'', component: DashboardComponent, children:
  [
    {path:'create', component: CreateComponent},
    {path:'modify', component: ModifyComponent},
    {path:'projects', component: ProjectsComponent}
  ]},
  { path:'login', component: LoginComponent},
  { path:'register', component: RegisterComponent}
  ];

export const mainRouter: ModuleWithProviders = RouterModule.forRoot(router);
