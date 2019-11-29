// TODO: What fields should be required?
export interface UserRole {
    guid?: string;
    userId?:string;
    roleId?:string;
    effectiveDate?:string; // See expiryDate...
    expiryDate?:string; // Roles don't inherently expire, but a user's role assignment can
    locationId?:string; // If defined, the user role is only valid for a particular location
    createdBy?:string;
    updatedBy?:string;
    createdDtm?:string;
    updatedDtm?:string;
    revisionCount?:number;
}