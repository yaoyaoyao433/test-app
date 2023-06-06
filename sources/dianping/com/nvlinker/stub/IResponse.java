package dianping.com.nvlinker.stub;

import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IResponse {
    Object error();

    HashMap<String, String> headers();

    boolean isSuccess();

    byte[] result();

    int statusCode();
}
