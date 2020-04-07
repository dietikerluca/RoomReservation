package roomreservation

import grails.rest.RestfulController

import static org.springframework.http.HttpStatus.METHOD_NOT_ALLOWED

class NonDeleteRestfulController extends RestfulController {

     NonDeleteRestfulController(Class resource) {
        super(resource)
    }

    NonDeleteRestfulController(Class resource, boolean readOnly) {
        super(resource, readOnly)
    }

    @Override
    def delete() {
        // Return Method not allowed HTTP status code.
        render status: METHOD_NOT_ALLOWED
    }

}
