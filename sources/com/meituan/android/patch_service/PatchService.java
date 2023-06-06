package com.meituan.android.patch_service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ServiceForegroundHelper;
import com.sankuai.waimai.foundation.core.lifecycle.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PatchService extends IntentService {
    public static ChangeQuickRedirect a;

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523e516e80a88443b22b9ea3e37b7c8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523e516e80a88443b22b9ea3e37b7c8c");
            return;
        }
        c.b(this);
        super.onDestroy();
    }

    public PatchService() {
        super("PatchService");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42c6d7534d41e2a1b949fb404785ecbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42c6d7534d41e2a1b949fb404785ecbb");
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4, ResultReceiver resultReceiver) {
        Object[] objArr = {context, str, str2, str3, str4, resultReceiver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7760d8e902b10d3abd99df54dcfca05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7760d8e902b10d3abd99df54dcfca05");
            return;
        }
        Intent intent = new Intent(context, PatchService.class);
        intent.setAction("com.meituan.android.patch.action.PATCH");
        intent.putExtra("com.meituan.android.patch.extra.OLD_FILE", str);
        intent.putExtra("com.meituan.android.patch.extra.NEW_FILE", str2);
        intent.putExtra("com.meituan.android.patch.extra.PATCH_FILE", str3);
        intent.putExtra("com.meituan.android.patch.extra.MERGE_FILE", str4);
        intent.putExtra("com.meituan.android.patch.extra.RESULTRECEIVER", resultReceiver);
        ServiceForegroundHelper.startService(context, intent);
    }

    public static String a(Bundle bundle) throws Exception {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e159fcf36f9518082213be53ab851ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e159fcf36f9518082213be53ab851ee");
        }
        String string = bundle.getString("com.meituan.android.patch.result.NEWFILE");
        if (string == null || string.length() == 0) {
            throw new Exception(bundle.getString("com.meituan.android.patch.result.EXCEPTION"));
        }
        return string;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b0e64336f1f308cf423c3c3a8c159cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b0e64336f1f308cf423c3c3a8c159cf");
            return;
        }
        c.a(this);
        super.onCreate();
        ServiceForegroundHelper.startForeground(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.patch_service.PatchService.onHandleIntent(android.content.Intent):void");
    }
}
