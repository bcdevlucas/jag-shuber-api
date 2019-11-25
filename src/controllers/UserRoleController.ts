import { Body, Delete, Get, Path, Post, Put, Query, Route } from 'tsoa';
import { Assignment } from '../models/Assignment';
import { DutyRecurrence } from '../models/DutyRecurrence';
import { AssignmentService } from '../services/AssignmentService';
import ControllerBase from '../infrastructure/ControllerBase';
import { DutyRecurrenceService } from '../services/DutyRecurrenceService';
import { Security } from '../authentication';
import { Inject, AutoWired } from 'typescript-ioc';
import { UserService } from '../services/UserService';
import { User } from '../models/User';
import { UserRoleService } from '../services/UserRoleService';
import { UserRole } from '../models/UserRole';

@Route('UserRole')
@Security('jwt')
@AutoWired
export class UserRoleController extends ControllerBase<any, UserRoleService> {
    @Inject
    protected serviceInstance!: UserRoleService;

    @Get('me')
    public getCurrentUserRoles(){
        return super.getAll();
    }

    @Get()
    public getUserRoles(){
        return super.getAll();
    }

    @Get('{id}')
    public getUserRoleById(id: string){
        return super.getById(id);
    }

    @Post()
    public createUserRole(@Body() model: UserRole){
        return super.create(model);
    }

    @Post('{id}/expire')
    public expireUserRole(@Path() id:string, @Body() model: UserRole){
        return super.update(id, model);
    }

    @Put('{id}')
    public updateUserRole(@Path() id: string, @Body() model: UserRole) {
        return super.update(id,model);
    }

    @Delete('{id}')
    public deleteUserRole(@Path() id:string){
        return super.delete(id);
    }
}
