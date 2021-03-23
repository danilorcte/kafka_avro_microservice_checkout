/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.microservices.ecommerce.payment.event;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PaymentCreatedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7422403654743155966L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PaymentCreatedEvent\",\"namespace\":\"com.microservices.ecommerce.payment.event\",\"fields\":[{\"name\":\"checkoutCode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"checkoutStatus\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"paymentCode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PaymentCreatedEvent> ENCODER =
      new BinaryMessageEncoder<PaymentCreatedEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PaymentCreatedEvent> DECODER =
      new BinaryMessageDecoder<PaymentCreatedEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PaymentCreatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PaymentCreatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PaymentCreatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PaymentCreatedEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PaymentCreatedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PaymentCreatedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PaymentCreatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PaymentCreatedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String checkoutCode;
   private java.lang.String checkoutStatus;
   private java.lang.String paymentCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PaymentCreatedEvent() {}

  /**
   * All-args constructor.
   * @param checkoutCode The new value for checkoutCode
   * @param checkoutStatus The new value for checkoutStatus
   * @param paymentCode The new value for paymentCode
   */
  public PaymentCreatedEvent(java.lang.String checkoutCode, java.lang.String checkoutStatus, java.lang.String paymentCode) {
    this.checkoutCode = checkoutCode;
    this.checkoutStatus = checkoutStatus;
    this.paymentCode = paymentCode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return checkoutCode;
    case 1: return checkoutStatus;
    case 2: return paymentCode;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: checkoutCode = value$ != null ? value$.toString() : null; break;
    case 1: checkoutStatus = value$ != null ? value$.toString() : null; break;
    case 2: paymentCode = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'checkoutCode' field.
   * @return The value of the 'checkoutCode' field.
   */
  public java.lang.String getCheckoutCode() {
    return checkoutCode;
  }


  /**
   * Sets the value of the 'checkoutCode' field.
   * @param value the value to set.
   */
  public void setCheckoutCode(java.lang.String value) {
    this.checkoutCode = value;
  }

  /**
   * Gets the value of the 'checkoutStatus' field.
   * @return The value of the 'checkoutStatus' field.
   */
  public java.lang.String getCheckoutStatus() {
    return checkoutStatus;
  }


  /**
   * Sets the value of the 'checkoutStatus' field.
   * @param value the value to set.
   */
  public void setCheckoutStatus(java.lang.String value) {
    this.checkoutStatus = value;
  }

  /**
   * Gets the value of the 'paymentCode' field.
   * @return The value of the 'paymentCode' field.
   */
  public java.lang.String getPaymentCode() {
    return paymentCode;
  }


  /**
   * Sets the value of the 'paymentCode' field.
   * @param value the value to set.
   */
  public void setPaymentCode(java.lang.String value) {
    this.paymentCode = value;
  }

  /**
   * Creates a new PaymentCreatedEvent RecordBuilder.
   * @return A new PaymentCreatedEvent RecordBuilder
   */
  public static com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder newBuilder() {
    return new com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder();
  }

  /**
   * Creates a new PaymentCreatedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PaymentCreatedEvent RecordBuilder
   */
  public static com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder newBuilder(com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder other) {
    if (other == null) {
      return new com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder();
    } else {
      return new com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new PaymentCreatedEvent RecordBuilder by copying an existing PaymentCreatedEvent instance.
   * @param other The existing instance to copy.
   * @return A new PaymentCreatedEvent RecordBuilder
   */
  public static com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder newBuilder(com.microservices.ecommerce.payment.event.PaymentCreatedEvent other) {
    if (other == null) {
      return new com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder();
    } else {
      return new com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for PaymentCreatedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PaymentCreatedEvent>
    implements org.apache.avro.data.RecordBuilder<PaymentCreatedEvent> {

    private java.lang.String checkoutCode;
    private java.lang.String checkoutStatus;
    private java.lang.String paymentCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.checkoutCode)) {
        this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.checkoutStatus)) {
        this.checkoutStatus = data().deepCopy(fields()[1].schema(), other.checkoutStatus);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.paymentCode)) {
        this.paymentCode = data().deepCopy(fields()[2].schema(), other.paymentCode);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing PaymentCreatedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.microservices.ecommerce.payment.event.PaymentCreatedEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.checkoutCode)) {
        this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.checkoutStatus)) {
        this.checkoutStatus = data().deepCopy(fields()[1].schema(), other.checkoutStatus);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.paymentCode)) {
        this.paymentCode = data().deepCopy(fields()[2].schema(), other.paymentCode);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'checkoutCode' field.
      * @return The value.
      */
    public java.lang.String getCheckoutCode() {
      return checkoutCode;
    }


    /**
      * Sets the value of the 'checkoutCode' field.
      * @param value The value of 'checkoutCode'.
      * @return This builder.
      */
    public com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder setCheckoutCode(java.lang.String value) {
      validate(fields()[0], value);
      this.checkoutCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'checkoutCode' field has been set.
      * @return True if the 'checkoutCode' field has been set, false otherwise.
      */
    public boolean hasCheckoutCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'checkoutCode' field.
      * @return This builder.
      */
    public com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder clearCheckoutCode() {
      checkoutCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'checkoutStatus' field.
      * @return The value.
      */
    public java.lang.String getCheckoutStatus() {
      return checkoutStatus;
    }


    /**
      * Sets the value of the 'checkoutStatus' field.
      * @param value The value of 'checkoutStatus'.
      * @return This builder.
      */
    public com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder setCheckoutStatus(java.lang.String value) {
      validate(fields()[1], value);
      this.checkoutStatus = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'checkoutStatus' field has been set.
      * @return True if the 'checkoutStatus' field has been set, false otherwise.
      */
    public boolean hasCheckoutStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'checkoutStatus' field.
      * @return This builder.
      */
    public com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder clearCheckoutStatus() {
      checkoutStatus = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'paymentCode' field.
      * @return The value.
      */
    public java.lang.String getPaymentCode() {
      return paymentCode;
    }


    /**
      * Sets the value of the 'paymentCode' field.
      * @param value The value of 'paymentCode'.
      * @return This builder.
      */
    public com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder setPaymentCode(java.lang.String value) {
      validate(fields()[2], value);
      this.paymentCode = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'paymentCode' field has been set.
      * @return True if the 'paymentCode' field has been set, false otherwise.
      */
    public boolean hasPaymentCode() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'paymentCode' field.
      * @return This builder.
      */
    public com.microservices.ecommerce.payment.event.PaymentCreatedEvent.Builder clearPaymentCode() {
      paymentCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PaymentCreatedEvent build() {
      try {
        PaymentCreatedEvent record = new PaymentCreatedEvent();
        record.checkoutCode = fieldSetFlags()[0] ? this.checkoutCode : (java.lang.String) defaultValue(fields()[0]);
        record.checkoutStatus = fieldSetFlags()[1] ? this.checkoutStatus : (java.lang.String) defaultValue(fields()[1]);
        record.paymentCode = fieldSetFlags()[2] ? this.paymentCode : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PaymentCreatedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<PaymentCreatedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PaymentCreatedEvent>
    READER$ = (org.apache.avro.io.DatumReader<PaymentCreatedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.checkoutCode);

    out.writeString(this.checkoutStatus);

    out.writeString(this.paymentCode);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.checkoutCode = in.readString();

      this.checkoutStatus = in.readString();

      this.paymentCode = in.readString();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.checkoutCode = in.readString();
          break;

        case 1:
          this.checkoutStatus = in.readString();
          break;

        case 2:
          this.paymentCode = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










