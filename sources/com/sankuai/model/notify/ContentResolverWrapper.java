package com.sankuai.model.notify;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class ContentResolverWrapper implements DataNotifier {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ContentResolver contentResolver;

    public ContentResolverWrapper(ContentResolver contentResolver) {
        Object[] objArr = {contentResolver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68f95943353920eb098cc56947725e25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68f95943353920eb098cc56947725e25");
        } else {
            this.contentResolver = contentResolver;
        }
    }

    @Override // com.sankuai.model.notify.DataNotifier
    public void notifyChange(Uri uri, ContentObserver contentObserver) {
        Object[] objArr = {uri, contentObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddea8614e9930fb93018c05c9e751f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddea8614e9930fb93018c05c9e751f58");
        } else {
            this.contentResolver.notifyChange(uri, contentObserver);
        }
    }

    @Override // com.sankuai.model.notify.DataNotifier
    public void registerContentObserver(Uri uri, boolean z, ContentObserver contentObserver) {
        Object[] objArr = {uri, Byte.valueOf(z ? (byte) 1 : (byte) 0), contentObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9651b3d848d0a79be2bbb0314661bbb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9651b3d848d0a79be2bbb0314661bbb7");
        } else {
            this.contentResolver.registerContentObserver(uri, z, contentObserver);
        }
    }

    @Override // com.sankuai.model.notify.DataNotifier
    public void unregisterContentObserver(ContentObserver contentObserver) {
        Object[] objArr = {contentObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fc0eb918adecc72b18ea9c6deb54a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fc0eb918adecc72b18ea9c6deb54a83");
        } else {
            this.contentResolver.unregisterContentObserver(contentObserver);
        }
    }
}
