/*
 * Copyright 2005-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ldap.odm.core.impl;

import org.springframework.ldap.odm.core.OdmException;

/**
 * Thrown to indicate that an instance is not suitable for persisting in the LDAP directory.
 * 
 * @author Paul Harvey &lt;paul.at.pauls-place.me.uk&gt;
 *
 */
@SuppressWarnings("serial")
public class InvalidEntryException extends OdmException {
	public InvalidEntryException(String message) {
		super(message);
	}

	public InvalidEntryException(String message, Throwable reason) {
		super(message, reason);
	}
}
