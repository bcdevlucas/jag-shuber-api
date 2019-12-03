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

@Route('User')
@Security('jwt')
@AutoWired
export class UserController extends ControllerBase<any, UserService> {
    @Inject
    protected serviceInstance!: UserService;

    @Get('me')
    public getCurrentUser(): User {
        const { token: {
            guid = '',
            displayName = '',
            type = '',
            userId = ''
        } = {} } = this.currentUser;
        // const user: User = { guid, displayName, type, userId };
        const user: User = {};
        return user;
    }

    @Get()
    public getUsers(){
        return super.getAll();
    }

    @Get('{id}')
    public getUserById(id: string){
        return super.getById(id);
    }

    @Post()
    public createUser(@Body() model: User){
        return super.create(model);
    }

    @Put('{id}')
    public updateUser(@Path() id: string, @Body() model: User) {
        return super.update(id,model);
    }

    @Delete('{id}')
    public deleteUser(@Path() id:string){
        return super.delete(id);
    }
}
