package com.sankuai.xm.imui.session.listener;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.n;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.session.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements com.sankuai.xm.im.transfer.download.c {
    public static ChangeQuickRedirect a;
    private c.a b;

    public c(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e3d11725897fefcd94899aa90524d08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e3d11725897fefcd94899aa90524d08");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.xm.im.transfer.download.c
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f1a697155bc54fd1fdbbb4badf277e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f1a697155bc54fd1fdbbb4badf277e8");
            return;
        }
        d.b("MediaDownloadListener.onSuccess url[%s] download success, local path: %s", str, str2);
        a(str, str2, 8, 100);
    }

    @Override // com.sankuai.xm.im.transfer.download.c
    public final void a(String str, String str2, int i, String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911c5463eef5661fdabdb964202ae983", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911c5463eef5661fdabdb964202ae983");
            return;
        }
        d.d("MediaDownloadListener.onFailure url[%s] download failed: %s", str, str3);
        a(str, str2, 7, 0);
    }

    @Override // com.sankuai.xm.im.transfer.download.c
    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f7d581e3041782ffeb7a4606349e243", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f7d581e3041782ffeb7a4606349e243");
        } else {
            a(str, str2, 6, i);
        }
    }

    private void a(final String str, String str2, final int i, final int i2) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b31dd252c7021a7fedf3249fa67c69ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b31dd252c7021a7fedf3249fa67c69ed");
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            for (com.sankuai.xm.imui.session.entity.b bVar : this.b.c()) {
                if ((bVar.b instanceof MediaMessage) && ((MediaMessage) bVar.b).containsUrl(str)) {
                    final MediaMessage mediaMessage = (MediaMessage) bVar.b;
                    if ((mediaMessage instanceof ImageMessage) && i == 8) {
                        ImageMessage imageMessage = (ImageMessage) mediaMessage;
                        String thumbnailPath = imageMessage.getThumbnailPath();
                        String type = imageMessage.getType();
                        String b = (TextUtils.isEmpty(type) || !n.i(type)) ? com.sankuai.xm.file.util.c.b(thumbnailPath) : null;
                        if (!TextUtils.isEmpty(b) && n.g(b) && !type.toLowerCase().endsWith(b)) {
                            imageMessage.setType(b);
                            DBProxy.l().k.a(MessageUtils.imMessageToDBMessage(imageMessage), new String[]{DBMessage.RESERVE_32_ONE}, (Callback<DBMessage>) null);
                        }
                    }
                    Bundle bundle = bVar.o;
                    bundle.putInt("xm_sdk_" + str, i);
                    bVar.f = i2;
                    com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.listener.c.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "611a6fa4121601692397d7568696fb0c", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "611a6fa4121601692397d7568696fb0c");
                                return;
                            }
                            c.b d = c.this.b.d();
                            if (d != null) {
                                d.a(mediaMessage.getMsgUuid(), str, i, i2);
                            }
                        }
                    }));
                }
            }
        }
    }
}
