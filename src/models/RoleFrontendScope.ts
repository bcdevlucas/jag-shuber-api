import { RolePermission } from './RolePermission'

/**
 * Scoped permissions for the frontend application.
 * This could be re-implemented in a modular fashion if necessary,
 * but seeing as there is only one consumer of this API, it's overkill
 * for our current needs.
 */
// TODO: What fields should be required?
export interface RoleFrontendScope {
    guid?: string;
    roleFrontendScopeId?:string;
    roleId?:string;
    rolePermissions:Array<RolePermission | undefined>;
    createdBy?:string;
    updatedBy?:string;
    createdDtm?:string;
    updatedDtm?:string;
    revisionCount?:number;
}