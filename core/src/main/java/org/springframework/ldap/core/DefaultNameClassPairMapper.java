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

package org.springframework.ldap.core;

import javax.naming.NameClassPair;
import javax.naming.NamingException;

/**
 * The default NameClassPairMapper implementation. This implementation simply
 * takes the Name string from the supplied NameClassPair and returns it as
 * result.
 * 
 * @author Mattias Hellborg Arthursson
 * 
 */
public class DefaultNameClassPairMapper implements NameClassPairMapper<String> {

	/**
	 * Gets the Name from the supplied NameClassPair and returns it as the
	 * result.
	 * 
	 * @param nameClassPair
	 *			the NameClassPair to transform.
	 * @return the Name string from the NameClassPair.
	 */
	@Override
	public String mapFromNameClassPair(NameClassPair nameClassPair)
			throws NamingException {

		return nameClassPair.getName();
	}

}
