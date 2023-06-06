package com.sankuai.xm.integration.mediapicker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.AbstractServiceRegistry;
import com.sankuai.xm.im.message.api.e;
import com.sankuai.xm.integration.mediapreviewer.IMediaPreviewer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MediaToolRegistry extends AbstractServiceRegistry {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.base.service.AbstractServiceRegistry
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4068a0cf54c7e99b0cef861ef98c9441", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4068a0cf54c7e99b0cef861ef98c9441");
            return;
        }
        a(e.class, new AbstractServiceRegistry.b<c>() { // from class: com.sankuai.xm.integration.mediapicker.MediaToolRegistry.1
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d44c15326d998f7e9c60018d033f4f2", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d44c15326d998f7e9c60018d033f4f2") : new c();
            }
        });
        a(IMediaPicker.class, new AbstractServiceRegistry.b<MTMediaPicker>() { // from class: com.sankuai.xm.integration.mediapicker.MediaToolRegistry.2
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37d2764600a497f60f35d0ba164f3e6f", 6917529027641081856L) ? (MTMediaPicker) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37d2764600a497f60f35d0ba164f3e6f") : new MTMediaPicker();
            }
        });
        a(IMediaPreviewer.class, new AbstractServiceRegistry.b<MTMediaPicker>() { // from class: com.sankuai.xm.integration.mediapicker.MediaToolRegistry.3
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52a543e238953c8a76331a17fbaaa7dc", 6917529027641081856L) ? (MTMediaPicker) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52a543e238953c8a76331a17fbaaa7dc") : new MTMediaPicker();
            }
        });
    }
}
