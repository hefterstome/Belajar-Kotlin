package app

/*
 ** ANNOTATION TARGET: kemampuan untuk memberi target berbeda pada masing-masing object
    Cara memakainya dengan @target:NamaAnnotation
*/

@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta

class ExampleTarget(
//    @Beta val firstName: String, //Jika di @Beta akan masuk ke default
//    @Beta val middleName: String,
//    @Beta val lastName: String

    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)