package retrofit.converter;

import java.lang.reflect.Type;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface Converter {
    Object fromBody(TypedInput typedInput, Type type) throws ConversionException;

    TypedOutput toBody(Object obj);
}
