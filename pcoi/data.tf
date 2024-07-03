data "aws_lambda_function" "lambuda_authorizer" {
  function_name = "nodeJsAuthorizer2"
}

data "aws_iam_role" "authorizer_role_invoke_lambda" {
  name = "APIGatewayWriteLogs"
}