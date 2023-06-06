package retrofit.converter;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import retrofit.mime.MimeUtil;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class GsonConverter implements Converter {
    private String charset;
    private final Gson gson;

    public GsonConverter(Gson gson) {
        this(gson, "UTF-8");
    }

    public GsonConverter(Gson gson, String str) {
        this.gson = gson;
        this.charset = str;
    }

    @Override // retrofit.converter.Converter
    public Object fromBody(TypedInput typedInput, Type type) throws ConversionException {
        InputStreamReader inputStreamReader;
        String str = this.charset;
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(typedInput.in(), str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Object fromJson = this.gson.fromJson(inputStreamReader, type);
                try {
                    inputStreamReader.close();
                } catch (IOException unused) {
                }
                return fromJson;
            } catch (JsonParseException e) {
                e = e;
                throw new ConversionException(e);
            } catch (IOException e2) {
                e = e2;
                throw new ConversionException(e);
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader2 = inputStreamReader;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (JsonParseException e3) {
            e = e3;
        } catch (IOException e4) {
            e = e4;
        }
    }

    @Override // retrofit.converter.Converter
    public TypedOutput toBody(Object obj) {
        try {
            return new JsonTypedOutput(this.gson.toJson(obj).getBytes(this.charset), this.charset);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class JsonTypedOutput implements TypedOutput {
        private final byte[] jsonBytes;
        private final String mimeType;

        @Override // retrofit.mime.TypedOutput
        public String fileName() {
            return null;
        }

        JsonTypedOutput(byte[] bArr, String str) {
            this.jsonBytes = bArr;
            this.mimeType = "application/json; charset=" + str;
        }

        @Override // retrofit.mime.TypedOutput
        public String mimeType() {
            return this.mimeType;
        }

        @Override // retrofit.mime.TypedOutput
        public long length() {
            return this.jsonBytes.length;
        }

        @Override // retrofit.mime.TypedOutput
        public void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(this.jsonBytes);
        }
    }
}
