package seminars.entities;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class SeminarSerialiser extends StdSerializer<Seminar> {

    public SeminarSerialiser() {
        this(null);
    }

    protected SeminarSerialiser(Class<Seminar> t) {
        super(t);
    }

    @Override
    public void serialize(Seminar value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeNumberField("id", value.getId());
        gen.writeStringField("name", value.getName());
        gen.writeNumberField("price", value.getPrice());
        gen.writeEndObject();
    }
}
