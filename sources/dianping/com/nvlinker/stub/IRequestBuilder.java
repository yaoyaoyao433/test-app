package dianping.com.nvlinker.stub;

import java.io.InputStream;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IRequestBuilder {
    IRequestBuilder addHeaders(String str, String str2);

    IRequest build();

    IRequest get();

    IRequestBuilder headers(HashMap<String, String> hashMap);

    IRequestBuilder input(InputStream inputStream);

    IRequestBuilder ipUrl(String str);

    IRequestBuilder method(String str);

    IRequest post();

    IRequestBuilder reqId(String str);

    IRequestBuilder timeout(int i);

    IRequestBuilder url(String str);
}
