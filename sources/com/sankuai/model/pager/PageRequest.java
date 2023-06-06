package com.sankuai.model.pager;

import com.sankuai.model.Request;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface PageRequest<T> extends Request<T> {
    public static final String LIMIT = "limit";
    public static final String OFFSET = "offset";
    public static final String PAGING = "paging";

    int getTotal();

    void setLimit(int i);

    void setStart(int i);

    void setTotal(int i);
}
