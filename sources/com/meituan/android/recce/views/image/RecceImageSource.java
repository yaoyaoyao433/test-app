package com.meituan.android.recce.views.image;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.titans.utils.LocalIdUtils;
import com.facebook.react.views.imagehelper.a;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceImageSource {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Pattern mPattern = Pattern.compile("data:image/[\\*a-z]+;base64,([a-zA-Z0-9\\+/=]+)");
    private Context mContext;
    private int mErrorId;
    private double mHeight;
    private byte[] mImageBytes;
    private boolean mIsDioImage;
    private boolean mIsResource;
    private String mOriginalSource;
    private int mPlaceholderId;
    private int mResourceId;
    private Uri mSourceUri;
    private double mWidth;

    public RecceImageSource(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7386d21f28daf5f2eac912a3246dc31b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7386d21f28daf5f2eac912a3246dc31b");
        } else {
            this.mContext = context;
        }
    }

    private boolean isDioFileUri(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff0c96dee822a186268e0a88d368e271", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff0c96dee822a186268e0a88d368e271")).booleanValue() : uri != null && "file".equals(uri.getScheme()) && isDioFilePath(uri.getPath());
    }

    private boolean isDioFilePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81af000cb899a45876c959495c6b95c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81af000cb899a45876c959495c6b95c8")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(MRNBundleManager.DIO_BUNDLE_SUFFIX);
    }

    public void setSource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b7ce12cfee4e62a739113717a08bdc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b7ce12cfee4e62a739113717a08bdc5");
            return;
        }
        this.mOriginalSource = str;
        this.mIsDioImage = false;
        Uri computeUri = computeUri(str);
        if (computeUri != null && computeUri.getScheme() != null) {
            if (TextUtils.equals(computeUri.getScheme(), "data")) {
                Matcher matcher = mPattern.matcher(str);
                if (matcher == null || !matcher.find() || TextUtils.isEmpty(matcher.group(1))) {
                    return;
                }
                this.mImageBytes = Base64.decode(matcher.group(1), 0);
                return;
            } else if (LocalIdUtils.isValid(str)) {
                this.mSourceUri = makeKnbMediaToUri(str);
                return;
            } else if (isDioFileUri(computeUri)) {
                this.mIsDioImage = true;
                this.mSourceUri = Uri.parse(str);
                return;
            } else if (TextUtils.equals(computeUri.getScheme(), "file")) {
                File file = new File(str.length() > 7 ? str.substring(7) : null);
                if (!file.exists()) {
                    String name = file.getName();
                    int lastIndexOf = name.lastIndexOf(CommonConstant.Symbol.DOT);
                    if (lastIndexOf != -1) {
                        name = name.substring(0, lastIndexOf);
                    }
                    this.mIsResource = true;
                    this.mResourceId = computeLocalResource(name);
                    return;
                }
                this.mSourceUri = computeUri;
                return;
            } else {
                this.mSourceUri = computeUri;
                return;
            }
        }
        this.mIsResource = true;
        this.mResourceId = computeLocalResource(str);
    }

    public void setPlaceHolderResource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6fbd395fa9a062f108b8829e8a28558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6fbd395fa9a062f108b8829e8a28558");
        } else {
            this.mPlaceholderId = computeLocalResource(str);
        }
    }

    public int getPlaceHolderDrawableId() {
        return this.mPlaceholderId;
    }

    public void setErrorResource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d47116a28f10537fc4dd9def625ba8ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d47116a28f10537fc4dd9def625ba8ed");
        } else {
            this.mErrorId = computeLocalResource(str);
        }
    }

    public int getErrorDrawableId() {
        return this.mErrorId;
    }

    public void setWidth(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac2285c193c4c415e5a546b06fb5b604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac2285c193c4c415e5a546b06fb5b604");
        } else {
            this.mWidth = d;
        }
    }

    public void setHeight(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c58710e67a85094b6f3df2eb466aa12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c58710e67a85094b6f3df2eb466aa12");
        } else {
            this.mHeight = d;
        }
    }

    public double getWidth() {
        return this.mWidth;
    }

    public double getHeight() {
        return this.mHeight;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public boolean isResource() {
        return this.mIsResource;
    }

    public boolean isDioImage() {
        return this.mIsDioImage;
    }

    public int getResourceId() {
        return this.mResourceId;
    }

    public byte[] getImageBytes() {
        return this.mImageBytes;
    }

    public String getOriginalSource() {
        return this.mOriginalSource;
    }

    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae8663b6b3f0138c135d53d2c2c097d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae8663b6b3f0138c135d53d2c2c097d1");
            return;
        }
        this.mSourceUri = null;
        this.mWidth = 0.0d;
        this.mHeight = 0.0d;
        this.mResourceId = 0;
        this.mIsResource = false;
        this.mImageBytes = null;
        this.mOriginalSource = null;
    }

    private Uri computeUri(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7558acefe445c9236f149ef7d1c42ffb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7558acefe445c9236f149ef7d1c42ffb");
        }
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private int computeLocalResource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1aedc5ddcd86528c9619bd49a66314a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1aedc5ddcd86528c9619bd49a66314a")).intValue() : a.a().a(this.mContext, str);
    }

    private Uri makeKnbMediaToUri(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c81e73f57778bc39c11c854e92d99ae8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c81e73f57778bc39c11c854e92d99ae8");
        }
        File file = LocalIdUtils.getFile(str);
        if (file != null && file.exists() && file.isFile()) {
            return Uri.fromFile(file);
        }
        return null;
    }
}
