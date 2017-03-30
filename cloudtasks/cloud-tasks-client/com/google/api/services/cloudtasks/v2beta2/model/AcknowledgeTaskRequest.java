/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-02-08 11:51:56 PST)
 * on 2017-02-08 at 19:52:26 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.cloudtasks.v2beta2.model;

/**
 * Request message for acknowledging a task using CloudTasks.AcknowledgeTask.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AcknowledgeTaskRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required.
   *
   * The task schedule time, available in the Task.schedule_time returned in PullTasksResponse.tasks
   * or CloudTasks.RenewLease.  This restriction is to check that the caller is acknowledging the
   * correct task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduleTime;

  /**
   * Required.
   *
   * The task schedule time, available in the Task.schedule_time returned in PullTasksResponse.tasks
   * or CloudTasks.RenewLease.  This restriction is to check that the caller is acknowledging the
   * correct task.
   * @return value or {@code null} for none
   */
  public String getScheduleTime() {
    return scheduleTime;
  }

  /**
   * Required.
   *
   * The task schedule time, available in the Task.schedule_time returned in PullTasksResponse.tasks
   * or CloudTasks.RenewLease.  This restriction is to check that the caller is acknowledging the
   * correct task.
   * @param scheduleTime scheduleTime or {@code null} for none
   */
  public AcknowledgeTaskRequest setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  @Override
  public AcknowledgeTaskRequest set(String fieldName, Object value) {
    return (AcknowledgeTaskRequest) super.set(fieldName, value);
  }

  @Override
  public AcknowledgeTaskRequest clone() {
    return (AcknowledgeTaskRequest) super.clone();
  }

}