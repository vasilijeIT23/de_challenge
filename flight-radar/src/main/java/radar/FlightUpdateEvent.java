/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package radar;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class FlightUpdateEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4321517050571222056L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FlightUpdateEvent\",\"namespace\":\"radar\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"date\",\"type\":[\"null\",\"string\"]},{\"name\":\"destination\",\"type\":\"string\"},{\"name\":\"STD\",\"type\":[\"null\",\"long\"]},{\"name\":\"STA\",\"type\":[\"null\",\"long\"]},{\"name\":\"timezones\",\"type\":\"string\"},{\"name\":\"status\",\"type\":[\"null\",\"string\"]},{\"name\":\"gate\",\"type\":[\"null\",\"string\"]},{\"name\":\"airline\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FlightUpdateEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FlightUpdateEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<FlightUpdateEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<FlightUpdateEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<FlightUpdateEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this FlightUpdateEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a FlightUpdateEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a FlightUpdateEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static FlightUpdateEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence id;
  private java.lang.CharSequence date;
  private java.lang.CharSequence destination;
  private java.lang.Long STD;
  private java.lang.Long STA;
  private java.lang.CharSequence timezones;
  private java.lang.CharSequence status;
  private java.lang.CharSequence gate;
  private java.lang.CharSequence airline;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FlightUpdateEvent() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param date The new value for date
   * @param destination The new value for destination
   * @param STD The new value for STD
   * @param STA The new value for STA
   * @param timezones The new value for timezones
   * @param status The new value for status
   * @param gate The new value for gate
   * @param airline The new value for airline
   */
  public FlightUpdateEvent(java.lang.CharSequence id, java.lang.CharSequence date, java.lang.CharSequence destination, java.lang.Long STD, java.lang.Long STA, java.lang.CharSequence timezones, java.lang.CharSequence status, java.lang.CharSequence gate, java.lang.CharSequence airline) {
    this.id = id;
    this.date = date;
    this.destination = destination;
    this.STD = STD;
    this.STA = STA;
    this.timezones = timezones;
    this.status = status;
    this.gate = gate;
    this.airline = airline;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return date;
    case 2: return destination;
    case 3: return STD;
    case 4: return STA;
    case 5: return timezones;
    case 6: return status;
    case 7: return gate;
    case 8: return airline;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: date = (java.lang.CharSequence)value$; break;
    case 2: destination = (java.lang.CharSequence)value$; break;
    case 3: STD = (java.lang.Long)value$; break;
    case 4: STA = (java.lang.Long)value$; break;
    case 5: timezones = (java.lang.CharSequence)value$; break;
    case 6: status = (java.lang.CharSequence)value$; break;
    case 7: gate = (java.lang.CharSequence)value$; break;
    case 8: airline = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'date' field.
   * @return The value of the 'date' field.
   */
  public java.lang.CharSequence getDate() {
    return date;
  }


  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'destination' field.
   * @return The value of the 'destination' field.
   */
  public java.lang.CharSequence getDestination() {
    return destination;
  }


  /**
   * Sets the value of the 'destination' field.
   * @param value the value to set.
   */
  public void setDestination(java.lang.CharSequence value) {
    this.destination = value;
  }

  /**
   * Gets the value of the 'STD' field.
   * @return The value of the 'STD' field.
   */
  public java.lang.Long getSTD() {
    return STD;
  }


  /**
   * Sets the value of the 'STD' field.
   * @param value the value to set.
   */
  public void setSTD(java.lang.Long value) {
    this.STD = value;
  }

  /**
   * Gets the value of the 'STA' field.
   * @return The value of the 'STA' field.
   */
  public java.lang.Long getSTA() {
    return STA;
  }


  /**
   * Sets the value of the 'STA' field.
   * @param value the value to set.
   */
  public void setSTA(java.lang.Long value) {
    this.STA = value;
  }

  /**
   * Gets the value of the 'timezones' field.
   * @return The value of the 'timezones' field.
   */
  public java.lang.CharSequence getTimezones() {
    return timezones;
  }


  /**
   * Sets the value of the 'timezones' field.
   * @param value the value to set.
   */
  public void setTimezones(java.lang.CharSequence value) {
    this.timezones = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'gate' field.
   * @return The value of the 'gate' field.
   */
  public java.lang.CharSequence getGate() {
    return gate;
  }


  /**
   * Sets the value of the 'gate' field.
   * @param value the value to set.
   */
  public void setGate(java.lang.CharSequence value) {
    this.gate = value;
  }

  /**
   * Gets the value of the 'airline' field.
   * @return The value of the 'airline' field.
   */
  public java.lang.CharSequence getAirline() {
    return airline;
  }


  /**
   * Sets the value of the 'airline' field.
   * @param value the value to set.
   */
  public void setAirline(java.lang.CharSequence value) {
    this.airline = value;
  }

  /**
   * Creates a new FlightUpdateEvent RecordBuilder.
   * @return A new FlightUpdateEvent RecordBuilder
   */
  public static radar.FlightUpdateEvent.Builder newBuilder() {
    return new radar.FlightUpdateEvent.Builder();
  }

  /**
   * Creates a new FlightUpdateEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FlightUpdateEvent RecordBuilder
   */
  public static radar.FlightUpdateEvent.Builder newBuilder(radar.FlightUpdateEvent.Builder other) {
    if (other == null) {
      return new radar.FlightUpdateEvent.Builder();
    } else {
      return new radar.FlightUpdateEvent.Builder(other);
    }
  }

  /**
   * Creates a new FlightUpdateEvent RecordBuilder by copying an existing FlightUpdateEvent instance.
   * @param other The existing instance to copy.
   * @return A new FlightUpdateEvent RecordBuilder
   */
  public static radar.FlightUpdateEvent.Builder newBuilder(radar.FlightUpdateEvent other) {
    if (other == null) {
      return new radar.FlightUpdateEvent.Builder();
    } else {
      return new radar.FlightUpdateEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for FlightUpdateEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FlightUpdateEvent>
    implements org.apache.avro.data.RecordBuilder<FlightUpdateEvent> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence date;
    private java.lang.CharSequence destination;
    private java.lang.Long STD;
    private java.lang.Long STA;
    private java.lang.CharSequence timezones;
    private java.lang.CharSequence status;
    private java.lang.CharSequence gate;
    private java.lang.CharSequence airline;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(radar.FlightUpdateEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.date)) {
        this.date = data().deepCopy(fields()[1].schema(), other.date);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.destination)) {
        this.destination = data().deepCopy(fields()[2].schema(), other.destination);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.STD)) {
        this.STD = data().deepCopy(fields()[3].schema(), other.STD);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.STA)) {
        this.STA = data().deepCopy(fields()[4].schema(), other.STA);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.timezones)) {
        this.timezones = data().deepCopy(fields()[5].schema(), other.timezones);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.status)) {
        this.status = data().deepCopy(fields()[6].schema(), other.status);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.gate)) {
        this.gate = data().deepCopy(fields()[7].schema(), other.gate);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.airline)) {
        this.airline = data().deepCopy(fields()[8].schema(), other.airline);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing FlightUpdateEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(radar.FlightUpdateEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.date)) {
        this.date = data().deepCopy(fields()[1].schema(), other.date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.destination)) {
        this.destination = data().deepCopy(fields()[2].schema(), other.destination);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.STD)) {
        this.STD = data().deepCopy(fields()[3].schema(), other.STD);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.STA)) {
        this.STA = data().deepCopy(fields()[4].schema(), other.STA);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.timezones)) {
        this.timezones = data().deepCopy(fields()[5].schema(), other.timezones);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.status)) {
        this.status = data().deepCopy(fields()[6].schema(), other.status);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.gate)) {
        this.gate = data().deepCopy(fields()[7].schema(), other.gate);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.airline)) {
        this.airline = data().deepCopy(fields()[8].schema(), other.airline);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'date' field.
      * @return The value.
      */
    public java.lang.CharSequence getDate() {
      return date;
    }


    /**
      * Sets the value of the 'date' field.
      * @param value The value of 'date'.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.date = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'date' field has been set.
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'date' field.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder clearDate() {
      date = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'destination' field.
      * @return The value.
      */
    public java.lang.CharSequence getDestination() {
      return destination;
    }


    /**
      * Sets the value of the 'destination' field.
      * @param value The value of 'destination'.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder setDestination(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.destination = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'destination' field has been set.
      * @return True if the 'destination' field has been set, false otherwise.
      */
    public boolean hasDestination() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'destination' field.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder clearDestination() {
      destination = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'STD' field.
      * @return The value.
      */
    public java.lang.Long getSTD() {
      return STD;
    }


    /**
      * Sets the value of the 'STD' field.
      * @param value The value of 'STD'.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder setSTD(java.lang.Long value) {
      validate(fields()[3], value);
      this.STD = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'STD' field has been set.
      * @return True if the 'STD' field has been set, false otherwise.
      */
    public boolean hasSTD() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'STD' field.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder clearSTD() {
      STD = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'STA' field.
      * @return The value.
      */
    public java.lang.Long getSTA() {
      return STA;
    }


    /**
      * Sets the value of the 'STA' field.
      * @param value The value of 'STA'.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder setSTA(java.lang.Long value) {
      validate(fields()[4], value);
      this.STA = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'STA' field has been set.
      * @return True if the 'STA' field has been set, false otherwise.
      */
    public boolean hasSTA() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'STA' field.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder clearSTA() {
      STA = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'timezones' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimezones() {
      return timezones;
    }


    /**
      * Sets the value of the 'timezones' field.
      * @param value The value of 'timezones'.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder setTimezones(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.timezones = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'timezones' field has been set.
      * @return True if the 'timezones' field has been set, false otherwise.
      */
    public boolean hasTimezones() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'timezones' field.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder clearTimezones() {
      timezones = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.status = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder clearStatus() {
      status = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'gate' field.
      * @return The value.
      */
    public java.lang.CharSequence getGate() {
      return gate;
    }


    /**
      * Sets the value of the 'gate' field.
      * @param value The value of 'gate'.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder setGate(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.gate = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'gate' field has been set.
      * @return True if the 'gate' field has been set, false otherwise.
      */
    public boolean hasGate() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'gate' field.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder clearGate() {
      gate = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'airline' field.
      * @return The value.
      */
    public java.lang.CharSequence getAirline() {
      return airline;
    }


    /**
      * Sets the value of the 'airline' field.
      * @param value The value of 'airline'.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder setAirline(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.airline = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'airline' field has been set.
      * @return True if the 'airline' field has been set, false otherwise.
      */
    public boolean hasAirline() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'airline' field.
      * @return This builder.
      */
    public radar.FlightUpdateEvent.Builder clearAirline() {
      airline = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FlightUpdateEvent build() {
      try {
        FlightUpdateEvent record = new FlightUpdateEvent();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.date = fieldSetFlags()[1] ? this.date : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.destination = fieldSetFlags()[2] ? this.destination : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.STD = fieldSetFlags()[3] ? this.STD : (java.lang.Long) defaultValue(fields()[3]);
        record.STA = fieldSetFlags()[4] ? this.STA : (java.lang.Long) defaultValue(fields()[4]);
        record.timezones = fieldSetFlags()[5] ? this.timezones : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.status = fieldSetFlags()[6] ? this.status : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.gate = fieldSetFlags()[7] ? this.gate : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.airline = fieldSetFlags()[8] ? this.airline : (java.lang.CharSequence) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FlightUpdateEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<FlightUpdateEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FlightUpdateEvent>
    READER$ = (org.apache.avro.io.DatumReader<FlightUpdateEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.id);

    if (this.date == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.date);
    }

    out.writeString(this.destination);

    if (this.STD == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.STD);
    }

    if (this.STA == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.STA);
    }

    out.writeString(this.timezones);

    if (this.status == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.status);
    }

    if (this.gate == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.gate);
    }

    if (this.airline == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.airline);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.date = null;
      } else {
        this.date = in.readString(this.date instanceof Utf8 ? (Utf8)this.date : null);
      }

      this.destination = in.readString(this.destination instanceof Utf8 ? (Utf8)this.destination : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.STD = null;
      } else {
        this.STD = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.STA = null;
      } else {
        this.STA = in.readLong();
      }

      this.timezones = in.readString(this.timezones instanceof Utf8 ? (Utf8)this.timezones : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.status = null;
      } else {
        this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.gate = null;
      } else {
        this.gate = in.readString(this.gate instanceof Utf8 ? (Utf8)this.gate : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.airline = null;
      } else {
        this.airline = in.readString(this.airline instanceof Utf8 ? (Utf8)this.airline : null);
      }

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.date = null;
          } else {
            this.date = in.readString(this.date instanceof Utf8 ? (Utf8)this.date : null);
          }
          break;

        case 2:
          this.destination = in.readString(this.destination instanceof Utf8 ? (Utf8)this.destination : null);
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.STD = null;
          } else {
            this.STD = in.readLong();
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.STA = null;
          } else {
            this.STA = in.readLong();
          }
          break;

        case 5:
          this.timezones = in.readString(this.timezones instanceof Utf8 ? (Utf8)this.timezones : null);
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.status = null;
          } else {
            this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
          }
          break;

        case 7:
          if (in.readIndex() != 1) {
            in.readNull();
            this.gate = null;
          } else {
            this.gate = in.readString(this.gate instanceof Utf8 ? (Utf8)this.gate : null);
          }
          break;

        case 8:
          if (in.readIndex() != 1) {
            in.readNull();
            this.airline = null;
          } else {
            this.airline = in.readString(this.airline instanceof Utf8 ? (Utf8)this.airline : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









