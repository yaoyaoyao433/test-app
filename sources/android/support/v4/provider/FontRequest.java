package android.support.v4.provider;

import android.support.annotation.ArrayRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.util.Preconditions;
import android.util.Base64;
import com.meituan.robust.common.CommonConstant;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class FontRequest {
    private final List<List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final String mIdentifier;
    private final String mProviderAuthority;
    private final String mProviderPackage;
    private final String mQuery;

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.mProviderAuthority = (String) Preconditions.checkNotNull(str);
        this.mProviderPackage = (String) Preconditions.checkNotNull(str2);
        this.mQuery = (String) Preconditions.checkNotNull(str3);
        this.mCertificates = (List) Preconditions.checkNotNull(list);
        this.mCertificatesArray = 0;
        this.mIdentifier = this.mProviderAuthority + CommonConstant.Symbol.MINUS + this.mProviderPackage + CommonConstant.Symbol.MINUS + this.mQuery;
    }

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @ArrayRes int i) {
        this.mProviderAuthority = (String) Preconditions.checkNotNull(str);
        this.mProviderPackage = (String) Preconditions.checkNotNull(str2);
        this.mQuery = (String) Preconditions.checkNotNull(str3);
        this.mCertificates = null;
        Preconditions.checkArgument(i != 0);
        this.mCertificatesArray = i;
        this.mIdentifier = this.mProviderAuthority + CommonConstant.Symbol.MINUS + this.mProviderPackage + CommonConstant.Symbol.MINUS + this.mQuery;
    }

    public final String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    public final String getProviderPackage() {
        return this.mProviderPackage;
    }

    public final String getQuery() {
        return this.mQuery;
    }

    @Nullable
    public final List<List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    @ArrayRes
    public final int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getIdentifier() {
        return this.mIdentifier;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.mProviderAuthority + ", mProviderPackage: " + this.mProviderPackage + ", mQuery: " + this.mQuery + ", mCertificates:");
        for (int i = 0; i < this.mCertificates.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.mCertificates.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            }
            sb.append(" ]");
        }
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        sb.append("mCertificatesArray: " + this.mCertificatesArray);
        return sb.toString();
    }
}
