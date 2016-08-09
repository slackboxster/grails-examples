// https://mvnrepository.com/artifact/org.grails/grails-core
@Grab(group='org.grails', module='grails-core', version="3.1.9")

import grails.util.GrailsNameUtils

@RestController
class GrailsNameUtilExamples {

    @RequestMapping("/")
    String examples() {
        return """
            <h1>GrailsNameUtils examples</h1>
            <div>
                <ul>
                    <li>getClassName(java.lang.String logicalName, java.lang.String trailingName)</li>
                    <li>Returns the class name for the given logical name and trailing name.</li>
                    <li></li>
                    <li>GrailsNameUtils.getClassName("logicalName","trailingName"): ${GrailsNameUtils.getClassName("logicalName","trailingName")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getClassName(java.lang.String logicalName)</li>
                    <li>Return the class name for the given logical name.</li>
                    <li></li>
                    <li>GrailsNameUtils.getClassName("logicalName"): ${GrailsNameUtils.getClassName("logicalName")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getClassNameRepresentation(java.lang.String name)</li>
                    <li>Returns the class name representation of the given name</li>
                    <li></li>
                    <li>GrailsNameUtils.getClassNameRepresentation("logicalName"): ${GrailsNameUtils.getClassNameRepresentation("logicalName")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getGetterName(java.lang.String propertyName)</li>
                    <li>Calculate the name for a getter method to retrieve the specified property</li>
                    <li></li>
                    <li>GrailsNameUtils.getGetterName("name"): ${GrailsNameUtils.getGetterName("name")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getLogicalName(java.lang.Class<?> clazz, java.lang.String trailingName)</li>
                    <li>Retrieves the logical class name of a Grails artifact given the Grails class and a specified trailing name.</li>
                    <li></li>
                    <li>GrailsNameUtils.getLogicalName(GrailsNameUtilExamples, "trailingName"): ${GrailsNameUtils.getLogicalName(GrailsNameUtilExamples, "trailingName")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getLogicalName(java.lang.String name, java.lang.String trailingName)</li>
                    <li>Retrieves the logical name of the class without the trailing name</li>
                    <li></li>
                    <li>GrailsNameUtils.getLogicalName("GrailsNameUtilExamples", "trailingName"): ${GrailsNameUtils.getLogicalName("GrailsNameUtilExamples", "trailingName")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getLogicalPropertyName(java.lang.String className, java.lang.String trailingName)</li>
                    <li></li>
                    <li></li>
                    <li>GrailsNameUtils.getLogicalPropertyName("GrailsNameUtilExamples", "trailingName"): ${GrailsNameUtils.getLogicalPropertyName("GrailsNameUtilExamples", "trailingName")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getNameFromScript(java.lang.String scriptName)</li>
                    <li>Calculates the class name from a script name in the form my-funk-grails-script.</li>
                    <li></li>
                    <li>GrailsNameUtils.getNameFromScript("grails-name-util-examples"): ${GrailsNameUtils.getNameFromScript("grails-name-util-examples")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getNaturalName(java.lang.String name)</li>
                    <li>Converts a property name into its natural language equivalent eg ('firstName' becomes 'First Name')</li>
                    <li></li>
                    <li>GrailsNameUtils.getNaturalName("firstName"): ${GrailsNameUtils.getNaturalName("firstName")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getPluginName(java.lang.String descriptorName)</li>
                    <li>Returns the name of a plugin given the name of the *GrailsPlugin.groovy descriptor file.</li>
                    <li></li>
                    <li>GrailsNameUtils.getPluginName("SomethingGrailsPlugin.groovy"): ${GrailsNameUtils.getPluginName("SomethingGrailsPlugin.groovy")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getPropertyName(java.lang.String name)</li>
                    <li>Shorter version of getPropertyNameRepresentation.</li>
                    <li></li>
                    <li>GrailsNameUtils.getPropertyName("First Name"): ${GrailsNameUtils.getPropertyName("First Name")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getPropertyName(java.lang.Class<?> clazz)</li>
                    <li>Shorter version of getPropertyNameRepresentation.</li>
                    <li></li>
                    <li>GrailsNameUtils.getPropertyName(GrailsNameUtilExamples): ${GrailsNameUtils.getPropertyName(GrailsNameUtilExamples)}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getPropertyNameConvention(java.lang.Object object)</li>
                    <li>Returns an appropriate property name for the given object.</li>
                    <li></li>
                    <li>GrailsNameUtils.getPropertyNameConvention(new GrailsNameUtilExamples()): ${GrailsNameUtils.getPropertyNameConvention(new GrailsNameUtilExamples())}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getPropertyNameConvention(java.lang.Object object, java.lang.String suffix)</li>
                    <li>Returns an appropriate property name for the given object.</li>
                    <li></li>
                    <li>GrailsNameUtils.getPropertyNameConvention(new GrailsNameUtilExamples(), "Service"): ${GrailsNameUtils.getPropertyNameConvention(new GrailsNameUtilExamples(), "Service")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getPropertyNameForLowerCaseHyphenSeparatedName(java.lang.String name)</li>
                    <li>Converts foo-bar into fooBar.</li>
                    <li></li>
                    <li>GrailsNameUtils.getPropertyNameForLowerCaseHyphenSeparatedName("grails-name-util-examples"): ${GrailsNameUtils.getPropertyNameForLowerCaseHyphenSeparatedName("grails-name-util-examples")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getPropertyNameRepresentation(java.lang.Class<?> targetClass)</li>
                    <li>Returns the property name equivalent for the specified class.</li>
                    <li></li>
                    <li>GrailsNameUtils.getPropertyNameRepresentation(GrailsNameUtilExamples): ${GrailsNameUtils.getPropertyNameRepresentation(GrailsNameUtilExamples)}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getPropertyNameRepresentation(java.lang.String name)</li>
                    <li>Returns the property name representation of the given name.</li>
                    <li></li>
                    <li>GrailsNameUtils.getPropertyNameRepresentation("GrailsNameUtilExamples"): ${GrailsNameUtils.getPropertyNameRepresentation("GrailsNameUtilExamples")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getScriptName(java.lang.Class<?> clazz)</li>
                    <li>Retrieves the script name representation of the supplied class.</li>
                    <li></li>
                    <li>GrailsNameUtils.getScriptName(GrailsNameUtilExamples): ${GrailsNameUtils.getScriptName(GrailsNameUtilExamples)}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getScriptName(java.lang.String name)</li>
                    <li>Retrieves the script name representation of the given class name.</li>
                    <li></li>
                    <li>GrailsNameUtils.getScriptName("GrailsNameUtilExamples"): ${GrailsNameUtils.getScriptName("GrailsNameUtilExamples")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getSetterName(java.lang.String propertyName)</li>
                    <li>Retrieves the name of a setter for the specified property name</li>
                    <li></li>
                    <li>GrailsNameUtils.getSetterName("name"): ${GrailsNameUtils.getSetterName("name")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getShortName(java.lang.Class<?> targetClass)</li>
                    <li>Returns the class name without the package prefix.</li>
                    <li>Passes the class name into the string version of get</li>
                    <li>GrailsNameUtils.getShortName(grails.util.GrailsNameUtils): ${GrailsNameUtils.getShortName(grails.util.GrailsNameUtils)}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>getShortName(java.lang.String className)</li>
                    <li>Returns the class name without the package prefix.</li>
                    <li>Finds the last period in the string and strips everything up to that period.</li>
                    <li>GrailsNameUtils.getShortName("com.example.stuff.GrailsNameUtilExamples"): ${GrailsNameUtils.getShortName("com.example.stuff.GrailsNameUtilExamples")}</li>
                    <li>GrailsNameUtils.getShortName("com.example.GrailsNameUtilExamples"): ${GrailsNameUtils.getShortName("com.example.GrailsNameUtilExamples")}</li>
                    <li>GrailsNameUtils.getShortName("com.GrailsNameUtilExamples"): ${GrailsNameUtils.getShortName("com.GrailsNameUtilExamples")}</li>
                    <li>GrailsNameUtils.getShortName("GrailsNameUtilExamples"): ${GrailsNameUtils.getShortName("GrailsNameUtilExamples")}</li>
                    <li>GrailsNameUtils.getShortName("thingy"): ${GrailsNameUtils.getShortName("thingy")}</li>
                    <li>GrailsNameUtils.getShortName("This is a silly Example.NAME"): ${GrailsNameUtils.getShortName("This is a silly Example.NAME")}</li>
                </ul>
            </div>
            <div>
                <ul>
                    <li>isBlank(java.lang.String str)</li>
                    <li></li>
                    <li>Verifies the string is not null, empty, or whitespace. Uses String.trim() to remove whitespace</li>
                    <li>GrailsNameUtils.isBlank(null): ${GrailsNameUtils.isBlank(null)}</li>
                    <li>GrailsNameUtils.isBlank(""): ${GrailsNameUtils.isBlank("")}</li>
                    <li>GrailsNameUtils.isBlank("   "): ${GrailsNameUtils.isBlank("   ")}</li>
                    <li>GrailsNameUtils.isBlank("\\t"): ${GrailsNameUtils.isBlank("\t")}</li>
                    <li>GrailsNameUtils.isBlank("-----"): ${GrailsNameUtils.isBlank("-----")}</li>
                    <li>GrailsNameUtils.isBlank("notBlank"): ${GrailsNameUtils.isBlank("notBlank")}</li>
                </ul>
            </div>
        """
    }

}
