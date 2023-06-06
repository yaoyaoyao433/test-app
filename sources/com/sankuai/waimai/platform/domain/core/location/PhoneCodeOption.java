package com.sankuai.waimai.platform.domain.core.location;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.ui.a;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PhoneCodeOption implements a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("valid_digit")
    public int ValidDigit;
    @SerializedName("code")
    public String code;
    @SerializedName("text")
    public String text;

    @Override // com.sankuai.waimai.platform.ui.a
    public String invalidStr() {
        return this.text;
    }

    public boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1856c0b9a0f96b0a81aa49c4ca0983db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1856c0b9a0f96b0a81aa49c4ca0983db")).booleanValue();
        }
        if (obj != null && (obj instanceof PhoneCodeOption)) {
            return this.code.equals(((PhoneCodeOption) obj).code);
        }
        return false;
    }
}
