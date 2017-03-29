package org.example.errorhandlers;

import org.example.services.FooService;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.container.PageErrorHandler;
import org.hippoecm.hst.core.container.PageErrors;
import org.springframework.beans.factory.annotation.Autowired;

public class MyPageErrorHandler implements PageErrorHandler {

	@Autowired
	private FooService fooService;

	@Override
	public Status handleComponentExceptions(PageErrors pageErrors, HstRequest hstRequest, HstResponse hstResponse) {
		return Status.HANDLED_BUT_CONTINUE;
	}
}
