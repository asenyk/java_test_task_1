package seminars.entities;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class StudentSerialiser extends StdSerializer<Student> {

    public StudentSerialiser() {
        this(null);
    }

    protected StudentSerialiser(Class<Student> t) {
        super(t);
    }

    @Override
    public void serialize(Student value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeNumberField("id", value.getId());
        gen.writeStringField("lname", value.getLastName());
        gen.writeStringField("fname", value.getFirstName());
        gen.writeEndObject();
    }
}
