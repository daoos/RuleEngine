//Copyright Hale [hale2000@163.com]
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.

package tech.kiwa.engine.exception;
/**
 * @author Hale.Li
 * @since  2018-01-28
 * @version 0.1
 */
public class EmptyResultSetException extends RuleEngineException {

	/**
	 *
	 */
	private static final long serialVersionUID = -2247544711821509687L;

	public EmptyResultSetException() {
		super();
	}

	public EmptyResultSetException(String message) {
		super(message);
	}

	public EmptyResultSetException(Throwable cause) {
		super(cause);
	}

	public EmptyResultSetException(String message,Throwable cause) {
		super(message, cause);
	}


	public EmptyResultSetException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
    	super(message, cause, enableSuppression, writableStackTrace);
    }
}
