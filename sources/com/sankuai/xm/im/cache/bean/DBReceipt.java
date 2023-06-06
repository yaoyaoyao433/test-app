package com.sankuai.xm.im.cache.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.xm.im.message.bean.Receipt;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.Index;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "receipt_msgUuid", unique = true, value = "msgUuid")}, name = DBReceipt.TABLE_NAME)
/* loaded from: classes6.dex */
public final class DBReceipt extends Receipt {
    public static final String TABLE_NAME = "receipt_info";
    public static ChangeQuickRedirect changeQuickRedirect;
}
