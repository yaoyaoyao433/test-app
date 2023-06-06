package com.sankuai.model.pager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.Request;
import java.io.IOException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PageIterator<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean hasNext;
    private int limit;
    private final Request.Origin origin;
    private boolean pagedBySize;
    private final PageRequest<T> request;
    private T resource;
    private int start;

    public PageIterator(PageRequest<T> pageRequest, Request.Origin origin, int i, int i2) {
        Object[] objArr = {pageRequest, origin, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67207e9410b7d7f35f0223a48cdeeb2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67207e9410b7d7f35f0223a48cdeeb2c");
            return;
        }
        this.hasNext = true;
        this.pagedBySize = false;
        this.request = pageRequest;
        this.origin = origin;
        this.limit = i;
        this.start = i2;
    }

    public PageIterator(PageRequest<T> pageRequest, Request.Origin origin, int i, int i2, boolean z) {
        this(pageRequest, origin, i, i2);
        Object[] objArr = {pageRequest, origin, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45bed44c075fc7c66c281c6076a4e4bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45bed44c075fc7c66c281c6076a4e4bd");
        } else {
            this.pagedBySize = z;
        }
    }

    public PageIterator(PageRequest<T> pageRequest, Request.Origin origin, int i) {
        this(pageRequest, origin, i, 0);
        Object[] objArr = {pageRequest, origin, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c0240b43b891d46f7fa43a6a7cbe4e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c0240b43b891d46f7fa43a6a7cbe4e2");
        }
    }

    public PageIterator(PageRequest<T> pageRequest, Request.Origin origin, int i, boolean z) {
        this(pageRequest, origin, i, 0, z);
        Object[] objArr = {pageRequest, origin, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44933c93a494ee22d5ebad0fb206dccb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44933c93a494ee22d5ebad0fb206dccb");
        }
    }

    public T getResource() {
        return this.resource;
    }

    public void setResource(T t) {
        this.resource = t;
    }

    public PageRequest<T> getRequest() {
        return this.request;
    }

    public boolean hasNext() {
        return this.hasNext;
    }

    public void setHasNext(boolean z) {
        this.hasNext = z;
    }

    public void offsetStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c48d1e59287888aabbfc5a451b85ee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c48d1e59287888aabbfc5a451b85ee5");
        } else {
            this.start += i;
        }
    }

    public int getStart() {
        return this.start;
    }

    public int getLimit() {
        return this.limit;
    }

    public Request.Origin getOrigin() {
        return this.origin;
    }

    public Request.Origin loadFrom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18c2b61e6eb5bd3038931e3e793c87b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Request.Origin) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18c2b61e6eb5bd3038931e3e793c87b5");
        }
        if (this.origin == Request.Origin.UNSPECIFIED) {
            this.request.setStart(this.start);
            this.request.setLimit(this.limit);
            return this.request.isLocalValid() ? Request.Origin.LOCAL : Request.Origin.NET;
        }
        return this.origin;
    }

    public synchronized T next() throws IOException {
        int size;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a7fc895667508a9d0bfef600570682c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a7fc895667508a9d0bfef600570682c");
        } else if (!hasNext()) {
            throw new IllegalStateException("Doesn't have next");
        } else {
            this.request.setStart(this.start);
            this.request.setLimit(this.limit);
            T execute = this.request.execute(this.origin);
            int total = this.request.getTotal();
            if (execute == null) {
                this.hasNext = false;
            } else {
                if (execute instanceof List) {
                    size = ((List) execute).size();
                    if (this.resource == null) {
                        this.resource = execute;
                    } else {
                        ((List) this.resource).addAll((List) execute);
                    }
                } else if (execute instanceof Pageable) {
                    size = ((Pageable) execute).size();
                    if (this.resource == null) {
                        this.resource = execute;
                    } else {
                        ((Pageable) this.resource).append((Pageable) execute);
                    }
                } else {
                    throw new IllegalStateException("D must be a List or Pageable");
                }
                if (this.pagedBySize) {
                    this.start += size;
                } else {
                    this.start += this.limit;
                }
                if (total > 0) {
                    this.hasNext = this.start < total;
                } else if (size < this.limit) {
                    this.hasNext = false;
                }
            }
            return execute;
        }
    }

    public void setLimit(int i) {
        this.limit = i;
    }

    public void setStart(int i) {
        this.start = i;
    }
}
